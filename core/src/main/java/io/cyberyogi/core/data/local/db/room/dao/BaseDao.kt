package io.cyberyogi.core.data.local.db.room.dao

import androidx.room.*

@Dao
abstract class BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insert(item: T): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insertAll(itemList: List<T>): List<Long>

    @Update
    abstract fun update(item: T)

    @Update
    abstract fun updateAll(itemList: List<T>)

    @Delete
    abstract fun delete(item: T)

    @Transaction
    open fun upsert(item: T) {
        val id = insert(item)
        if (id == (-1).toLong()) update(item)
    }

    @Transaction
    open fun upsertAll(itemList: List<T>) {
        val insertList = insertAll(itemList)
        val updateList = mutableListOf<T>()
        for (i in insertList.indices) {
            if (insertList[i] == -1L) {
                updateList.add(itemList[i])
            }
        }
        if (updateList.isNotEmpty()) updateAll(updateList)
    }

    @Transaction
    open fun deleteAll(itemList: List<T>) {
        for (i in itemList) {
            delete(i)
        }
    }

}