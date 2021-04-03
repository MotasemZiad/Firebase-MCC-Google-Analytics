package com.ziad.motasem.myapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.analytics.FirebaseAnalytics
import com.ziad.motasem.myapp.adapter.GenericAdapter
import com.ziad.motasem.myapp.databinding.ActivityMainBinding
import com.ziad.motasem.myapp.model.Category

class MainActivity : AppCompatActivity(), GenericAdapter.OnListItemViewClickListener<Category> {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    private val adapterHome = GenericAdapter(R.layout.item_category, BR.category, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        firebaseAnalytics = FirebaseAnalytics.getInstance(this)




        adapterHome.data = categories
        mBinding.rcData.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = adapterHome
        }


        mBinding.root.setOnClickListener {
            logDataAnalytics("MainRootDesign", "Click Root Activity")
        }

    }

    override fun onClickItem(itemViewModel: Category, type: Int) {
        val intent = Intent(this, CategoryActivity::class.java)
        intent.putExtra("data", itemViewModel)
        startActivity(intent)
        logDataAnalytics("NameCategories", itemViewModel.name)
    }


    private fun logDataAnalytics(key: String, data: String) {
        val bundle = Bundle()
        bundle.putString(key, data)
        firebaseAnalytics.logEvent("MainCategoriesActivity", bundle)
    }

}