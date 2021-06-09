import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class SamplePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val extension = target.extensions.create("sample", SampleExtension::class.java)
    }
}

class Stuff() {
    var prop: Int = 0
}
abstract class SampleExtension {
    var extensionProp: Int = 42

    fun doOnStuff(action: Stuff.() -> Unit) {
        Stuff().action()
    }
}