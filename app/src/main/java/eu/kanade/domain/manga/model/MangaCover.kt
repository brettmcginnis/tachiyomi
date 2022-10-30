package eu.kanade.domain.manga.model

/**
 * Contains the required data for MangaCoverFetcher
 */
data class MangaCover(
    val mangaId: Long,
    val sourceId: Long,
    val isMangaFavorite: Boolean,
    val url: String?,
    val lastModified: Long,
)

// TODO: Is it possible to get a new image url ? Interceptor + retry
//Failed - MangaCover(mangaId=12, sourceId=2, isMangaFavorite=true, url=https://fmcdn.mangahere.com/store/manga/8198/cover.jpg?token=<TOKEN>&ttl=1666904400&v=1666767509, lastModified=0) - eu.kanade.tachiyomi.network.HttpException: HTTP error 403
