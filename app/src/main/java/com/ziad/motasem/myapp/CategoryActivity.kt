package com.ziad.motasem.myapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.analytics.FirebaseAnalytics
import com.ziad.motasem.myapp.adapter.GenericAdapter
import com.ziad.motasem.myapp.databinding.ActivityCategoryBinding
import com.ziad.motasem.myapp.model.Category
import com.ziad.motasem.myapp.model.Product

class CategoryActivity : AppCompatActivity(), GenericAdapter.OnListItemViewClickListener<Product>  {


    private val adapterHome = GenericAdapter(R.layout.item_product, BR.product, this)

    private lateinit var mBinding: ActivityCategoryBinding
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    private val data = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


        val category = intent.getParcelableExtra<Category>("data")!!
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)


        title = category.name

        products.forEach {
            if (it.idCategories == category.id) {
                data.add(it)
            }
        }
        adapterHome.data = data

        mBinding.rcData.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = adapterHome
        }
    }

    override fun onClickItem(itemViewModel: Product, type: Int) {
        val intent = Intent(this, ProductActivity::class.java)
        intent.putExtra("data", itemViewModel)
        logDataAnalytics("ProductName", itemViewModel.name)
        startActivity(intent)

    }


    private fun logDataAnalytics(key: String, data: String) {
        val bundle = Bundle()
        bundle.putString(key, data)
        firebaseAnalytics.logEvent("DetailsCategoryActivity", bundle)
    }
}