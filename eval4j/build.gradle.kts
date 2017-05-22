import org.jetbrains.kotlin.utils.PathUtil

apply { plugin("kotlin") }

dependencies {
    compile(project(":kotlin-stdlib"))
    compile(project(":kotlin-reflect"))
    compile(project(":compiler:backend"))
    compile(ideaSdkDeps("asm-all"))
//    compile(files(PathUtil.getJdkClassesRootsFromCurrentJre())) // TODO: make this one work instead of the nex one, since it contains more universal logic
    compile(files("${System.getProperty("java.home")}/../lib/tools.jar"))
    buildVersion()
}

configureKotlinProjectSourcesDefault()
configureKotlinProjectNoTests()

fixKotlinTaskDependencies()
