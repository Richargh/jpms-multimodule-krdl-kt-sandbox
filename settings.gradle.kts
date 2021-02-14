rootProject.name = "jpms-kotlin-multibuild"

include(
        "composition:all")

include(
        "component:catalogue",
        "component:catalogue-api",
        "component:shared-kernel")
