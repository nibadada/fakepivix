package com.lyj.fakepivix.app.databinding

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.lyj.fakepivix.app.adapter.BaseBindingAdapter

/**
 * @author greensun
 *
 * @date 2019/3/22
 *
 * @desc
 */
@BindingAdapter("adapter")
fun RecyclerView.adapter(adapter: BaseQuickAdapter<*, *>) {
    adapter.bindToRecyclerView(this)
}

/*@BindingAdapter(value = ["adapter", "items"], requireAll = true)
fun <T> RecyclerView.adapter(adapter: BaseBindingAdapter<T, out BaseBindingAdapter.BaseBindingViewHolder<out ViewDataBinding>>, items: ObservableList<T>?) {
    if (this.adapter != null)
        return
    adapter.bindToRecyclerView(this)
    adapter.setNewData(items)
    items?.addOnListChangedCallback(object : ObservableList.OnListChangedCallback<ObservableList<T>>(){
        override fun onChanged(sender: ObservableList<T>?) {
            adapter.notifyDataSetChanged()
        }

        override fun onItemRangeRemoved(sender: ObservableList<T>?, positionStart: Int, itemCount: Int) {
            adapter.notifyItemRangeRemoved(positionStart, itemCount)
        }

        override fun onItemRangeMoved(sender: ObservableList<T>?, fromPosition: Int, toPosition: Int, itemCount: Int) {
            if (itemCount == 1) {
                adapter.notifyItemMoved(fromPosition, toPosition)
            }else {
                adapter.notifyDataSetChanged()
            }
        }

        override fun onItemRangeInserted(sender: ObservableList<T>?, positionStart: Int, itemCount: Int) {
            adapter.notifyItemRangeInserted(positionStart, itemCount)
        }

        override fun onItemRangeChanged(sender: ObservableList<T>?, positionStart: Int, itemCount: Int) {
            adapter.notifyItemRangeChanged(positionStart, itemCount)
        }

    })
}*/
