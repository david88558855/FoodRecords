package lying.fengfeng.foodrecords.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import lying.fengfeng.foodrecords.entities.FoodTypeInfo

@Dao
interface FoodTypeInfoDao {

    @Insert
    fun insert(foodTypeInfo: FoodTypeInfo)

    @Query(" SELECT * FROM FOODTYPEINFO ")
    fun getAll(): List<FoodTypeInfo>

    @Delete
    fun remove(foodTypeInfo: FoodTypeInfo)
}