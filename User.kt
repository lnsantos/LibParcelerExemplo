package com.lucas.lib_parcelerexemplo

import org.parceler.Parcel
import org.parceler.ParcelConstructor

@Parcel
class User(
    var name     : String = "",
    var lastanem : String = "",
    var country  : String = ""
) {
    @ParcelConstructor constructor() : this("","","")
}