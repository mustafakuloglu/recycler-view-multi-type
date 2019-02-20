package com.kuloglu.app.recyclermultiitems.db.entities

data class Header(
        override var id: Int,
        override var type: Int,
        var header:String
) : BaseRecyclerEntity(id,type)