package com.abbasov.picassoadapters

class Item {
    var image=""
    var name=""

    constructor(image: String, name: String) {
        this.image = image
        this.name = name
    }

    override fun toString(): String {
        return "Item(image='$image', name='$name')"
    }

}