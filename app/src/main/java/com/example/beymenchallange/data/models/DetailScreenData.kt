package com.example.beymenchallange.data.models
data class DetailScreenData(
    val Exception: Any?,
    val IsOriginFromCheckout: Boolean?,
    val Message: Any?,
    val Result: DetailResult?,
    val Success: Boolean?,
    var isFavorite: Boolean?
)

data class DetailResult(
    val ActualPrice: Double?,
    val ActualPriceText: String?,
    val BrandLink: BrandLink?,
    val BrandName: String?,
    val BreadcrumbCategory: String?,
    val CategoryId: Int?,
    val CategoryLink: CategoryLink?,
    val CategoryName: String?,
    val ContentUrl: ContentUrl?,
    val Description: Description?,
    val DiscountRateText: String?,
    val DisplayName: String?,
    val EstimatedSupplyDate: Any?,
    val ExternalSystemCode: String?,
    val GtmModel: GtmModel?,
    val HasHopiParacik: Boolean?,
    val HasQuantitySelector: Boolean?,
    val HopiParacikText: Any?,
    val Images: List<Image>?,
    val Installment: Installment?,
    val IsBanned: Boolean?,
    val IsCosmeticProduct: Boolean?,
    val IsGiftCard: Boolean?,
    val IsPreOrder: Boolean?,
    val IsStrikeThroughPriceExist: Boolean?,
    val IsVatIncluded: Boolean?,
    val List: String?,
    val OtherColorList: List<Any>?,
    val ProductId: Int?,
    val ShareUrl: String?,
    val SizeSystem: String?,
    val StrikeThroughPrice: Double?,
    val StrikeThroughPriceText: String?,
    val VatRate: Double?
)

data class BrandLink(
    val DisplayName: String?,
    val Url: String?
)

data class CategoryLink(
    val DisplayName: String?,
    val Url: String?
)

data class ContentUrl(
    val Delivery: String?,
    val OneCard: String?,
    val Shipment: String?,
    val ShipmentAndDelivery: Any?,
    val SizeChartUrl: String?
)

data class Description(
    //val Kumaş ve Bakım :: String?,
    //val Yıl Sezon :: String?,
    //val Özellikler :: String?,
    //val Ürün Kodu: String?
    val dummy : String?
)

data class GtmModel(
    val Pconsignment: String?,
    val Pdsct: String?,
    val Pgen: String?,
    val Pmaingroup: String?,
    val Pother: String?,
    val Pproductgroup: String?,
    val Pseas: String?
)

data class Image(
    val DisplayOrder: Int?,
    val Images: List<ImageX>?
)

data class Installment(
    val HasInstallmentWarning: Boolean?,
    val InstallmentCount: Int?,
    val InstallmentWarningText: Any?,
    val Url: String?
)

data class ImageX(
    val ImageUrl: String?,
    val SizeCode: String?
)