package lying.fengfeng.foodrecords.ui.home

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import lying.fengfeng.foodrecords.entities.FoodInfo


class HomeViewModel: ViewModel() {

    var foodInfoList = mutableStateOf(listOf(FoodInfo("FoodName1", "2022-02-02", "CXasdfasdfasdfasdfaK", "7dayfs", "uuid"),
    ))

    fun updateList(value: FoodInfo) {
        foodInfoList.value = foodInfoList.value.toMutableList().apply { add(value) }
    }

    fun updateList(list: List<FoodInfo>) {
        foodInfoList.value = list
    }
}