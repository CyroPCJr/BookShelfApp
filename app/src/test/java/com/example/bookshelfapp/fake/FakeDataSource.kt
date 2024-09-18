package com.example.bookshelfapp.fake

import com.example.bookshelfapp.network.AccessInfo
import com.example.bookshelfapp.network.BookItem
import com.example.bookshelfapp.network.BookResponse
import com.example.bookshelfapp.network.EpubInfo
import com.example.bookshelfapp.network.ImageLinks
import com.example.bookshelfapp.network.IndustryIdentifier
import com.example.bookshelfapp.network.PanelizationSummary
import com.example.bookshelfapp.network.PdfInfo
import com.example.bookshelfapp.network.ReadingModes
import com.example.bookshelfapp.network.SaleInfo
import com.example.bookshelfapp.network.SearchInfo
import com.example.bookshelfapp.network.VolumeInfo

object FakeDataSource {

    val bookResponse: BookResponse = BookResponse(
        kind = "books#volumes",
        totalItems = 544,
        items = listOf(
            BookItem(
                kind = "books#volume",
                id = "qBxhhMkSLRMC",
                etag = "kTMadtnIV9M",
                selfLink = "https://www.googleapis.com/books/v1/volumes/qBxhhMkSLRMC",
                volumeInfo = VolumeInfo(
                    title = "Trippings in Author-land",
                    authors = listOf("Emily Chubbuck Judson"),
                    publishedDate = "1846",
                    industryIdentifiers = listOf(
                        IndustryIdentifier(
                            type = "OTHER",
                            identifier = "HARVARD:32044019377837"
                        )
                    ),
                    readingModes = ReadingModes(
                        text = false,
                        image = true
                    ),
                    pageCount = 298,
                    printType = "BOOK",
                    maturityRating = "NOT_MATURE",
                    allowAnonLogging = false,
                    contentVersion = "0.9.9.0.full.1",
                    panelizationSummary = PanelizationSummary(
                        containsEpubBubbles = false,
                        containsImageBubbles = false
                    ),
                    imageLinks = ImageLinks(
                        smallThumbnail = "http://books.google.com/books/content?id=qBxhhMkSLRMC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
                        thumbnail = "http://books.google.com/books/content?id=qBxhhMkSLRMC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
                    ),
                    language = "en",
                    previewLink = "http://books.google.com.br/books?id=qBxhhMkSLRMC&pg=PA273&dq=flowers+inauthor&hl=&cd=1&source=gbs_api",
                    infoLink = "https://play.google.com/store/books/details?id=qBxhhMkSLRMC&source=gbs_api",
                    canonicalVolumeLink = "https://play.google.com/store/books/details?id=qBxhhMkSLRMC"
                ),
                saleInfo = SaleInfo(
                    country = "BR",
                    saleability = "FREE",
                    isEbook = true,
                    buyLink = "https://play.google.com/store/books/details?id=qBxhhMkSLRMC&rdid=book-qBxhhMkSLRMC&rdot=1&source=gbs_api"
                ),
                accessInfo = AccessInfo(
                    country = "BR",
                    viewability = "ALL_PAGES",
                    embeddable = true,
                    publicDomain = true,
                    textToSpeechPermission = "ALLOWED",
                    epub = EpubInfo(
                        isAvailable = false,
                        downloadLink = "http://books.google.com.br/books/download/Trippings_in_Author_land.epub?id=qBxhhMkSLRMC&hl=&output=epub&source=gbs_api"
                    ),
                    pdf = PdfInfo(
                        isAvailable = true,
                        downloadLink = "http://books.google.com.br/books/download/Trippings_in_Author_land.pdf?id=qBxhhMkSLRMC&hl=&output=pdf&sig=ACfU3U2ecOY2qN_n_Yb4XgK-xWCBidj18g&source=gbs_api"
                    ),
                    webReaderLink = "http://play.google.com/books/reader?id=qBxhhMkSLRMC&hl=&source=gbs_api",
                    accessViewStatus = "FULL_PUBLIC_DOMAIN",
                    quoteSharingAllowed = false
                ),
                searchInfo = SearchInfo(
                    textSnippet = "... <b>flower</b> of its own native green - wood , the timid bud unfolding by the hearth - stone of an American savage , striking its roots down into his strong heart , and caring for no other soil , could not escape the calculating eye of a great ..."
                )
            )
        )
    )


}