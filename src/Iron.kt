class Iron(Brand:String ,Type:String ,Weight:String, name:String, ID:Int, price:Int, category:String ): Inventory(name, ID, price, category) {
    var Brand = Brand
    var Type = Type
    var Weight = Weight

    override fun vc()
    {
        println("!!!Inventory ITEM!!!\n")
        println("!!!$category!!!")
        println("ID : $ID \t Name : $name")
        println("category : $category   Price : $price")
        println("Brand : $Brand Type : $Type    Weight : $Weight\n")
    }
}