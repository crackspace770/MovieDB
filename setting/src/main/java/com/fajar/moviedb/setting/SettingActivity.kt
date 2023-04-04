package com.fajar.moviedb.setting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.fajar.moviedb.di.SettingModuleDependencies
import dagger.hilt.android.EntryPointAccessors
import java.util.*

class SettingActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerSettingComponent.builder()
            .context(this)
            .appDependencies(
                EntryPointAccessors.fromApplication(
                    applicationContext,
                    SettingModuleDependencies::class.java
                )
            )
            .build()
            .inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.settings, SettingsFragment())
                .commit()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)

            //TODO 11 : Update theme based on value in ListPreference(done)
            val theme = findPreference<ListPreference>(getString(R.string.pref_key_dark))

            theme?.onPreferenceChangeListener =
                Preference.OnPreferenceChangeListener { _, newValue ->
                    val nightModeValue = DarkMode.valueOf(newValue.toString().uppercase(Locale.US))
                    updateTheme(nightModeValue.value)
                    true
                }
        }

        private fun updateTheme(mode: Int): Boolean {
            AppCompatDelegate.setDefaultNightMode(mode)
            requireActivity().recreate()
            return true
        }
    }
}