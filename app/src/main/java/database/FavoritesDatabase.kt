package database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [FavoritesEntity::class],version = 1)
abstract  class FavoritesDatabase:RoomDatabase() {
    abstract fun FavoritesDAO():FavoritesDAO
}