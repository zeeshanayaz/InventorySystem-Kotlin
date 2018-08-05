class AirCondition(Brand:String ,Type:String ,Capacity:String, name:String, ID:Int, price:Int, category:String) : Inventory(name, ID, price, category){
    var Brand = Brand
    var Type = Type
    var Capacity = Capacity

    override fun vc() {
//        super.vc()
        println("!!!Inventory ITEM!!!\n")
        println("!!!$category!!!")
        println("ID : $ID \t Name : $name")
        println("category : $category   Price : $price")
        println("Brand : $Brand Type : $Type    Capacity : $Capacity\n")
    }
}