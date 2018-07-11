package com.generalmobile.app.recyclermultiitems.core

import com.generalmobile.app.recyclermultiitems.db.entities.BaseRecyclerEntity
import com.generalmobile.app.recyclermultiitems.db.entities.Header
import com.generalmobile.app.recyclermultiitems.db.entities.Image

class ListProvider{
    fun getList(): ArrayList<BaseRecyclerEntity> {
        val list = arrayListOf<BaseRecyclerEntity>()

        list.add(Header(0,Type.HEADER,"Lion"))
        list.add(Image(1,Type.IMAGE,"https://cdn.images.express.co.uk/img/dynamic/galleries/x701/67639.jpg"))
        list.add(Image(2,Type.IMAGE,"https://thenypost.files.wordpress.com/2018/02/man-eaten-by-lions.jpg?quality=90&strip=all"))
        list.add(Image(3,Type.IMAGE,"http://chandigarhbytes.com/wp-content/uploads/2017/07/Federico_Veronesi_2009-01-28-Masai-Mara_4728.jpg"))
        list.add(Header(4,Type.HEADER,"Tiger"))
        list.add(Image(5,Type.IMAGE,"http://kids.sandiegozoo.org/sites/default/files/2017-06/animal-hero-tiger_0.jpg"))
        list.add(Header(6,Type.HEADER,"Elephant"))
        list.add(Image(7,Type.IMAGE,"https://images.reference.com/reference-production-images/question/aq/700px-394px/how-fast-can-an-elephant-run_4a36d683-3805-4826-a9ce-e1f561dac754.jpg"))
        list.add(Header(8,Type.HEADER,"Peacock"))
        list.add(Image(9,Type.IMAGE,"https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Peacock_Plumage.jpg/1200px-Peacock_Plumage.jpg"))
        list.add(Image(10,Type.IMAGE,"https://www.samaa.tv/wp-content/uploads/2017/06/Peacocks-640x450.jpg"))
        list.add(Header(11,Type.HEADER,"Crow"))
        list.add(Image(12,Type.IMAGE,"https://orig00.deviantart.net/fb40/f/2009/158/d/4/d4394fbbf90a4deea1814b3bb8a801b0.jpg"))
return list
    }
}