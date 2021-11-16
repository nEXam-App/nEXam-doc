import java.io.File

//with lateinit you can initialice the variable later
lateinit var name:String
lateinit var lastname:String
lateinit var exams:Array<Exam>
lateinit var setting:Setting
val xmlMapper = XmlMapper()


class User(paramName:String, paramLastname:String){
    name = paramName
    lastname = paramLastname
    exams = ArrayOf()
    settings = new Settings()
}

fun exportUser(){
  xmlMapper.writeValue(File("./":String), object)
}

fun importUser(filePath:String){
  val imported = xmlMapper.readValue(File(filePath), :User)

}


fun setSetting(){

}

fun addExam(ex:Exam){
  exams.set(exams.size, ex)
}
