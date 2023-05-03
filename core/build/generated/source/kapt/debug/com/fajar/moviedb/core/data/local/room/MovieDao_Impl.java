package com.fajar.moviedb.core.data.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.fajar.moviedb.core.data.local.entity.MovieEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  private final EntityDeletionOrUpdateAdapter<MovieEntity> __deletionAdapterOfMovieEntity;

  private final EntityDeletionOrUpdateAdapter<MovieEntity> __updateAdapterOfMovieEntity;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MovieEntities` (`id`,`title`,`releaseDate`,`overview`,`genres`,`runtime`,`tagline`,`voteAverage`,`popularity`,`posterPath`,`backdropPath`,`isFavorite`,`isTvShow`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getReleaseDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOverview());
        }
        if (value.getGenres() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGenres());
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getRuntime());
        }
        if (value.getTagline() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTagline());
        }
        stmt.bindDouble(8, value.getVoteAverage());
        stmt.bindDouble(9, value.getPopularity());
        if (value.getPosterPath() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getBackdropPath());
        }
        final int _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        final int _tmp_1 = value.isTvShow() ? 1 : 0;
        stmt.bindLong(13, _tmp_1);
      }
    };
    this.__deletionAdapterOfMovieEntity = new EntityDeletionOrUpdateAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `MovieEntities` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfMovieEntity = new EntityDeletionOrUpdateAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `MovieEntities` SET `id` = ?,`title` = ?,`releaseDate` = ?,`overview` = ?,`genres` = ?,`runtime` = ?,`tagline` = ?,`voteAverage` = ?,`popularity` = ?,`posterPath` = ?,`backdropPath` = ?,`isFavorite` = ?,`isTvShow` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getReleaseDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOverview());
        }
        if (value.getGenres() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGenres());
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getRuntime());
        }
        if (value.getTagline() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTagline());
        }
        stmt.bindDouble(8, value.getVoteAverage());
        stmt.bindDouble(9, value.getPopularity());
        if (value.getPosterPath() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getBackdropPath());
        }
        final int _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        final int _tmp_1 = value.isTvShow() ? 1 : 0;
        stmt.bindLong(13, _tmp_1);
        stmt.bindLong(14, value.getId());
      }
    };
  }

  @Override
  public Object insertMovie(final List<MovieEntity> movie,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertFavoriteItem(final MovieEntity catalogueItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(catalogueItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object removeFavorite(final MovieEntity catalogueItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMovieEntity.handle(catalogueItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void updateFavoriteMovie(final MovieEntity movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMovieEntity.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<MovieEntity>> getPopularMovies() {
    final String _sql = "SELECT * FROM MovieEntities";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"MovieEntities"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIsTvShow = CursorUtil.getColumnIndexOrThrow(_cursor, "isTvShow");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final Integer _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            final boolean _tmpIsTvShow;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsTvShow);
            _tmpIsTvShow = _tmp_1 != 0;
            _item = new MovieEntity(_tmpId,_tmpTitle,_tmpReleaseDate,_tmpOverview,_tmpGenres,_tmpRuntime,_tmpTagline,_tmpVoteAverage,_tmpPopularity,_tmpPosterPath,_tmpBackdropPath,_tmpIsFavorite,_tmpIsTvShow);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getPopularTv() {
    final String _sql = "SELECT * FROM MovieEntities ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"MovieEntities"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIsTvShow = CursorUtil.getColumnIndexOrThrow(_cursor, "isTvShow");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final Integer _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            final boolean _tmpIsTvShow;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsTvShow);
            _tmpIsTvShow = _tmp_1 != 0;
            _item = new MovieEntity(_tmpId,_tmpTitle,_tmpReleaseDate,_tmpOverview,_tmpGenres,_tmpRuntime,_tmpTagline,_tmpVoteAverage,_tmpPopularity,_tmpPosterPath,_tmpBackdropPath,_tmpIsFavorite,_tmpIsTvShow);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getFavoriteMovie() {
    final String _sql = "SELECT * FROM MovieEntities WHERE isFavorite = 1 AND isTvShow = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"MovieEntities"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIsTvShow = CursorUtil.getColumnIndexOrThrow(_cursor, "isTvShow");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final Integer _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            final boolean _tmpIsTvShow;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsTvShow);
            _tmpIsTvShow = _tmp_1 != 0;
            _item = new MovieEntity(_tmpId,_tmpTitle,_tmpReleaseDate,_tmpOverview,_tmpGenres,_tmpRuntime,_tmpTagline,_tmpVoteAverage,_tmpPopularity,_tmpPosterPath,_tmpBackdropPath,_tmpIsFavorite,_tmpIsTvShow);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getFavoriteTv() {
    final String _sql = "SELECT * FROM MovieEntities WHERE isFavorite = 1 AND isTvShow = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"MovieEntities"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIsTvShow = CursorUtil.getColumnIndexOrThrow(_cursor, "isTvShow");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final Integer _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            final boolean _tmpIsTvShow;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsTvShow);
            _tmpIsTvShow = _tmp_1 != 0;
            _item = new MovieEntity(_tmpId,_tmpTitle,_tmpReleaseDate,_tmpOverview,_tmpGenres,_tmpRuntime,_tmpTagline,_tmpVoteAverage,_tmpPopularity,_tmpPosterPath,_tmpBackdropPath,_tmpIsFavorite,_tmpIsTvShow);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getTrendingMovies(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return CoroutinesRoom.createFlow(__db, false, new String[]{"MovieEntities"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            _item = __entityCursorConverter_comFajarMoviedbCoreDataLocalEntityMovieEntity(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getTrendingTv(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return CoroutinesRoom.createFlow(__db, false, new String[]{"MovieEntities"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            _item = __entityCursorConverter_comFajarMoviedbCoreDataLocalEntityMovieEntity(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private MovieEntity __entityCursorConverter_comFajarMoviedbCoreDataLocalEntityMovieEntity(
      Cursor cursor) {
    final MovieEntity _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfTitle = cursor.getColumnIndex("title");
    final int _cursorIndexOfReleaseDate = cursor.getColumnIndex("releaseDate");
    final int _cursorIndexOfOverview = cursor.getColumnIndex("overview");
    final int _cursorIndexOfGenres = cursor.getColumnIndex("genres");
    final int _cursorIndexOfRuntime = cursor.getColumnIndex("runtime");
    final int _cursorIndexOfTagline = cursor.getColumnIndex("tagline");
    final int _cursorIndexOfVoteAverage = cursor.getColumnIndex("voteAverage");
    final int _cursorIndexOfPopularity = cursor.getColumnIndex("popularity");
    final int _cursorIndexOfPosterPath = cursor.getColumnIndex("posterPath");
    final int _cursorIndexOfBackdropPath = cursor.getColumnIndex("backdropPath");
    final int _cursorIndexOfIsFavorite = cursor.getColumnIndex("isFavorite");
    final int _cursorIndexOfIsTvShow = cursor.getColumnIndex("isTvShow");
    final int _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = 0;
    } else {
      _tmpId = cursor.getInt(_cursorIndexOfId);
    }
    final String _tmpTitle;
    if (_cursorIndexOfTitle == -1) {
      _tmpTitle = null;
    } else {
      if (cursor.isNull(_cursorIndexOfTitle)) {
        _tmpTitle = null;
      } else {
        _tmpTitle = cursor.getString(_cursorIndexOfTitle);
      }
    }
    final String _tmpReleaseDate;
    if (_cursorIndexOfReleaseDate == -1) {
      _tmpReleaseDate = null;
    } else {
      if (cursor.isNull(_cursorIndexOfReleaseDate)) {
        _tmpReleaseDate = null;
      } else {
        _tmpReleaseDate = cursor.getString(_cursorIndexOfReleaseDate);
      }
    }
    final String _tmpOverview;
    if (_cursorIndexOfOverview == -1) {
      _tmpOverview = null;
    } else {
      if (cursor.isNull(_cursorIndexOfOverview)) {
        _tmpOverview = null;
      } else {
        _tmpOverview = cursor.getString(_cursorIndexOfOverview);
      }
    }
    final String _tmpGenres;
    if (_cursorIndexOfGenres == -1) {
      _tmpGenres = null;
    } else {
      if (cursor.isNull(_cursorIndexOfGenres)) {
        _tmpGenres = null;
      } else {
        _tmpGenres = cursor.getString(_cursorIndexOfGenres);
      }
    }
    final Integer _tmpRuntime;
    if (_cursorIndexOfRuntime == -1) {
      _tmpRuntime = null;
    } else {
      if (cursor.isNull(_cursorIndexOfRuntime)) {
        _tmpRuntime = null;
      } else {
        _tmpRuntime = cursor.getInt(_cursorIndexOfRuntime);
      }
    }
    final String _tmpTagline;
    if (_cursorIndexOfTagline == -1) {
      _tmpTagline = null;
    } else {
      if (cursor.isNull(_cursorIndexOfTagline)) {
        _tmpTagline = null;
      } else {
        _tmpTagline = cursor.getString(_cursorIndexOfTagline);
      }
    }
    final double _tmpVoteAverage;
    if (_cursorIndexOfVoteAverage == -1) {
      _tmpVoteAverage = 0;
    } else {
      _tmpVoteAverage = cursor.getDouble(_cursorIndexOfVoteAverage);
    }
    final double _tmpPopularity;
    if (_cursorIndexOfPopularity == -1) {
      _tmpPopularity = 0;
    } else {
      _tmpPopularity = cursor.getDouble(_cursorIndexOfPopularity);
    }
    final String _tmpPosterPath;
    if (_cursorIndexOfPosterPath == -1) {
      _tmpPosterPath = null;
    } else {
      if (cursor.isNull(_cursorIndexOfPosterPath)) {
        _tmpPosterPath = null;
      } else {
        _tmpPosterPath = cursor.getString(_cursorIndexOfPosterPath);
      }
    }
    final String _tmpBackdropPath;
    if (_cursorIndexOfBackdropPath == -1) {
      _tmpBackdropPath = null;
    } else {
      if (cursor.isNull(_cursorIndexOfBackdropPath)) {
        _tmpBackdropPath = null;
      } else {
        _tmpBackdropPath = cursor.getString(_cursorIndexOfBackdropPath);
      }
    }
    final boolean _tmpIsFavorite;
    if (_cursorIndexOfIsFavorite == -1) {
      _tmpIsFavorite = false;
    } else {
      final int _tmp;
      _tmp = cursor.getInt(_cursorIndexOfIsFavorite);
      _tmpIsFavorite = _tmp != 0;
    }
    final boolean _tmpIsTvShow;
    if (_cursorIndexOfIsTvShow == -1) {
      _tmpIsTvShow = false;
    } else {
      final int _tmp_1;
      _tmp_1 = cursor.getInt(_cursorIndexOfIsTvShow);
      _tmpIsTvShow = _tmp_1 != 0;
    }
    _entity = new MovieEntity(_tmpId,_tmpTitle,_tmpReleaseDate,_tmpOverview,_tmpGenres,_tmpRuntime,_tmpTagline,_tmpVoteAverage,_tmpPopularity,_tmpPosterPath,_tmpBackdropPath,_tmpIsFavorite,_tmpIsTvShow);
    return _entity;
  }
}
