val fabricLoaderVersion: String by extra
val architecturyApiVersion: String by extra

dependencies {
    implementation("net.fabricmc:fabric-loader:$fabricLoaderVersion")
    implementation("dev.architectury:architectury:${architecturyApiVersion}")
}

architectury {
    common("fabric", "neoforge")
}

//loom {
//    accessWidenerPath.set(file("src/main/resources/example.accesswidener"))
//}