package com.example.srodenas.comic.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/*
@author santiago rodenas herráiz
@Email srodher115@g.educaand.es
23/24
*/

/*
@SerializedName, se utiliza para que GSON sepa serializar la respuesta JSON a dicho atributo
@Expose. Si no ponemos nada más, GSON tendrá la obligación de serializar. En caso de que
pongamos @Expose(serialize=false), GSON no serializará dicho atributo.
 */
class ResponseComic (){
    @SerializedName("img")
    @Expose
    var img: String=""

    @SerializedName("title")
    @Expose
    var title: String =""


}