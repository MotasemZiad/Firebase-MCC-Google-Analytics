package com.ziad.motasem.myapp

import com.ziad.motasem.myapp.model.Category
import com.ziad.motasem.myapp.model.Product


val products = arrayListOf(
    Product(
        "1", "1", "HP Laptop",
        "Windows 10 Home 64\n" +
                "11th Gen Intel® Core™ i7 processor\n" +
                "Intel® Iris® Xe Graphics\n" +
                "16 GB memory; 256 GB SSD storage", 4.5f, R.drawable.img1
    ),
    Product(
        "2", "1", "Lenovo",
        "Windows 10 Home 64\n" +
                "AMD Ryzen™ 5 processor\n" +
                "AMD Radeon™ Graphics\n" +
                "12 GB memory; 256 GB SSD storage", 2.5f, R.drawable.img2
    ),
    Product(
        "3", "1", "MSI",
        "Windows 10 Home 64\n" +
                "AMD Ryzen™ 5 processor\n" +
                "AMD Radeon™ Vega 8 Graphics\n" +
                "12 GB memory; 256 GB SSD storage", 3.5f, R.drawable.img3
    ),
    Product(
        "4", "2", "Taboon Foods",
        "Address: Lorem Impsum, Pla Pla Pla.. \n" +
                "Open ⋅ Closes 6PM\n" +
                "Phone: 0567 788 280\n" +
                "Suggest an edit · Own this business?\n" +
                "Add missing information\n" +
                "Add website", 4.2f, R.drawable.img4
    ),
    Product(
        "5", "2", "Snonu",
        " Dine-in· Takeaway\n" +
                "Address: Lorem Impsum, Pla Pla Pla\n" +
                "Open ⋅ Closes 6PM\n" +
                "Phone: 0567 788 280\n" +
                "Suggest an edit · Own this business?\n" +
                "Add missing information", 3.2f, R.drawable.img5
    ),
    Product(
        "6", "2", "Tailandi",
        " Dine-in· Takeaway· No-contact delivery\n" +
                "Address: Lorem Impsum, Pla Pla Pla\n" +
                "Closed ⋅ Opens 9:30AM Wed\n" +
                "Phone: +972 8-288-6880\n" +
                "Suggest an edit · \n" +
                "Own this business?", 5f, R.drawable.img6
    ),
    Product(
        "7", "3", "iPhone",
        "Address: Germany \n" +
                "Open 24 hours\n" +
                "Suggest an edit · \n" +
                "Own this business?\n" +
                "Add missing information\n" +
                "Add phone number\n" +
                "Add website", 5f, R.drawable.img8
    ),
    Product(
        "7", "3", "Oppo",
        "Address: Silicon Valley\n" +
                "Address: Lorem Impsum, Pla Pla Pla\n" +
                "Open ⋅ Closes 7:30PM\n" +
                "Phone: +972 3-551-1692", 4f, R.drawable.img9
    ),
    Product(
        "7", "3", "Xiaomi",
        "Address: Rehov Omar Mukhtar\n" +
                "Open ⋅ Closes 6PM\n" +
                "Phone: +972 59-987-5294", 3f, R.drawable.img10
    ),
)


val categories = arrayListOf(
    Category(
        "1", "Laptops", R.drawable.img1
    ),
    Category(
        "2", "Food", R.drawable.img2
    ),
    Category(
        "3", "Samsung Phones ", R.drawable.img3
    ),
)