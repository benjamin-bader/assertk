buildscript {
    repositories {
        mavenCentral()
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
    }
}

apply {
    plugin("kotlin")
    //plugin<LibraryPlugin>()
}

repositories {
    gradleScriptKotlin()
}

dependencies {
    testCompile("junit:junit:4.12")
}