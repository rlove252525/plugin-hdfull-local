import org.gradle.api.Plugin
import org.gradle.api.Project

class CloudstreamPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create("cloudstream", CloudstreamExtension::class.java)
    }
}

open class CloudstreamExtension {
    var language: String = "en"
    var authors: List<String> = emptyList()
    var status: Int = 1
    var tvTypes: List<String> = emptyList()
    var iconUrl: String? = null
}
