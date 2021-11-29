package com.example.sunnyweather

import android.view.ContextMenu
import android.view.View
import androidx.fragment.app.Fragment

/**
 * @Description:
 * @CreateDate: 2021/11/29 16:36
 */
class BaseFragment:Fragment() {
    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
    }
}