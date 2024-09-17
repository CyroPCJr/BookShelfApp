package com.example.bookshelfapp.network

import kotlinx.serialization.Serializable

@Serializable
data class BookResponse(
    val kind: String,
    val totalItems: Int,
    val items: List<BookItem>,
)

@Serializable
data class BookItem(
    val kind: String,
    val id: String,
    val etag: String,
    val selfLink: String,
    val volumeInfo: VolumeInfo,
    val saleInfo: SaleInfo,
    val accessInfo: AccessInfo,
    val searchInfo: SearchInfo?,
)

@Serializable
data class VolumeInfo(
    val title: String,
    val authors: List<String>,
    val publishedDate: String?,
    val industryIdentifiers: List<IndustryIdentifier>,
    val readingModes: ReadingModes,
    val pageCount: Int?,
    val printType: String,
    val maturityRating: String,
    val allowAnonLogging: Boolean,
    val contentVersion: String,
    val panelizationSummary: PanelizationSummary?,
    val imageLinks: ImageLinks?,
    val language: String,
    val previewLink: String,
    val infoLink: String,
    val canonicalVolumeLink: String,
)

@Serializable
data class IndustryIdentifier(
    val type: String,
    val identifier: String,
)

@Serializable
data class ReadingModes(
    val text: Boolean,
    val image: Boolean,
)

@Serializable
data class PanelizationSummary(
    val containsEpubBubbles: Boolean,
    val containsImageBubbles: Boolean,
)

@Serializable
data class ImageLinks(
    val smallThumbnail: String,
    private val thumbnail: String,
) {
    val httpsThumbnail: String
        get() = thumbnail.replace(oldValue = "http", newValue = "https")
}


@Serializable
data class SaleInfo(
    val country: String,
    val saleability: String,
    val isEbook: Boolean,
    val buyLink: String?,
)

@Serializable
data class AccessInfo(
    val country: String,
    val viewability: String,
    val embeddable: Boolean,
    val publicDomain: Boolean,
    val textToSpeechPermission: String,
    val epub: EpubInfo,
    val pdf: PdfInfo,
    val webReaderLink: String,
    val accessViewStatus: String,
    val quoteSharingAllowed: Boolean,
)

@Serializable
data class EpubInfo(
    val isAvailable: Boolean,
    val downloadLink: String?,
)

@Serializable
data class PdfInfo(
    val isAvailable: Boolean,
    val downloadLink: String?,
)

@Serializable
data class SearchInfo(
    val textSnippet: String,
)