package com.kgmyshin.swagger.codgen.kotlin

import io.swagger.codegen.CodegenProperty
import io.swagger.codegen.DefaultCodegen
import io.swagger.codegen.languages.KotlinClientCodegen
import io.swagger.models.properties.Property
import java.util.*

class PokoGenConfig() : KotlinClientCodegen() {

    init {

        this.languageSpecificPrimitives = HashSet(Arrays.asList(
                "Byte",
                "Short",
                "Int",
                "Long",
                "Float",
                "Double",
                "Boolean",
                "Char",
                "String",
                "Array",
                "List",
                "Map",
                "Set",
                "Any"
        ))

        this.typeMapping.put("string", "String")
        this.typeMapping.put("boolean", "Boolean")
        this.typeMapping.put("integer", "Int")
        this.typeMapping.put("float", "Float")
        this.typeMapping.put("long", "Long")
        this.typeMapping.put("double", "Double")
        this.typeMapping.put("array", "List")
        this.typeMapping.put("list", "List")
        this.typeMapping.put("map", "Map")
        this.typeMapping.put("object", "Any")
        this.typeMapping.put("binary", "List<Byte>")
    }

    override fun getName(): String {
        return "poko"
    }

    override fun toModelFilename(name: String?): String {
        return toModelName(name)
    }

    override fun toModelName(name: String?): String {
        if (name != null && languageSpecificPrimitives.contains(name)) {
            return name
        } else {
            return super.toModelName(name)
        }
    }

    override fun fromProperty(name: String?, p: Property?): CodegenProperty {
        val property = super.fromProperty(name, p)
        property.baseName = DefaultCodegen.camelize(name, false)
        property.nameInCamelCase = DefaultCodegen.camelize(name, true)
        return property
    }
}