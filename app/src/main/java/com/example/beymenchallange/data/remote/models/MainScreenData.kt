package com.example.beymenchallange.data.remote.models

data class MainScreenData(
    val Exception: Any?,
    val IsOriginFromCheckout: Boolean,
    val Message: Any?,
    val Result: Result,
    val Success: Boolean
)

data class Result(
    val BannerList: Any?,
    val Category: String,
    val CategoryId: Int,
    val ContentList: Any?,
    val CustomFilters: CustomFilters,
    val Filters: Any?,
    val List: String,
    val OrderOption: String,
    val ProductList: List<Product>,
    val ShareLink: String,
    val SliderList: Any?,
    val TotalItemCount: Int,
    val TotalPageCount: Int
)

class CustomFilters

data class Product(
    val ActualPriceToShowOnScreen: Double,
    val ActualPriceToShowOnScreenText: String,
    val BrandName: String,
    val CdnResizedImageUrl: String,
    val DiscountRate: Int?,
    val DisplayName: String,
    val ImageUrl: String,
    val IsStrikeThroughPriceExists: Boolean,
    val Price: Double,
    val ProductId: Int,
    val SizeList: List<Size>,
    val StrikeThroughPriceToShowOnScreen: Double,
    val StrikeThroughPriceToShowOnScreenText: String,
    var isFavorite: Boolean?
)

data class Size(
    val InStock: Boolean,
    val SizeName: String,
    val VariantId: Int
)