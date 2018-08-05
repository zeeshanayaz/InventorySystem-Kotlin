class Microwave(Brand:String , Warranty:String ,Type:String, name:String, ID:Int, price:Int, category:String): Inventory(name, ID, price, category) {
    var Brand = Brand
    var Warranty = Warranty
    var Type = Type

    override fun vc(){
        println("!!!Inventory ITEM!!!\n")
        println("!!!$category!!!")
        println("ID : $ID \t Name : $name")
        println("category : $category   Price : $price")
        println("Brand : $Brand Type : $Type    Warranty : $Warranty\n")
    }
}