package com.kuloglu.app.recyclermultiitems.db.entities

data class Image (
        override var id: Int,
        override var type: Int,
        var url:String
) : BaseRecyclerEntity(id,type)