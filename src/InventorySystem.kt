fun main(args: Array<String>) {
    var m = ArrayList<Inventory>()
    println("AssalamuAlaikum,\n\tWellcome to Inventory System!")
    var i = 3
    do{
        println("\n\n\t~~~Select the Operation to Perform from (1 to 6)\n1) Add Inventory Item\n2) Search Inventory Item\n3) Update Inventory Item\n4) Delete Inventory Item\n5) Get All Item Details\n6) Exit")
        var a = readLine()!!.toInt()
        when(a){
//Add Inventory Items
            1 -> {
                println("~~Add Item~~")
                println("Select Inventory Category")
                println("Air Condition\nMicrowave\nIron")
                var checkItemCat = readLine()!!.toString()
                if (checkItemCat.toUpperCase() == "AIR CONDITION")
                {
                    print("Enter ID :  ")
                    var ID : Int = readLine()!!.toInt()
                    print("Enter Price :  ")
                    var price : Int = readLine()!!.toInt()
                    print("Enter Brand :  ")
                    var brand : String = readLine()!!.toString()
                    print("Enter Type :  ")
                    var type : String = readLine()!!.toString()
                    print("Enter Capacity :  ")
                    var capacity : String = readLine()!!.toString()

                    var AirConditionObj = AirCondition(brand,type,capacity,checkItemCat,ID,price,checkItemCat)
                    m.add(AirConditionObj)
                }
                else if (checkItemCat.toUpperCase() == "MICROWAVE")
                {
                    print("Enter ID :  ")
                    var ID : Int = readLine()!!.toInt()
                    print("Enter Price :  ")
                    var price : Int = readLine()!!.toInt()
                    print("Enter Brand :  ")
                    var brand : String = readLine()!!.toString()
                    print("Enter Type :  ")
                    var type : String = readLine()!!.toString()
                    print("Enter Warranty :  ")
                    var warranty : String = readLine()!!.toString()

                    var MicrowaveObj = Microwave(brand,type,warranty,checkItemCat,ID,price,checkItemCat)
                    m.add(MicrowaveObj)
                }
                else if (checkItemCat.toUpperCase() == "IRON")
                {
                    print("Enter ID :  ")
                    var ID : Int = readLine()!!.toInt()
                    print("Enter Price :  ")
                    var price : Int = readLine()!!.toInt()
                    print("Enter Brand :  ")
                    var brand : String = readLine()!!.toString()
                    print("Enter Type :  ")
                    var type : String = readLine()!!.toString()
                    print("Enter Weight :  ")
                    var weight : String = readLine()!!.toString()

                    var IronObj = Iron(brand,type,weight,checkItemCat,ID,price,checkItemCat)
                    m.add(IronObj)
                }
                else{
                    println("Wrong Selection!")
                }
            }
//Search Inventory Items
            2 -> {
                println("~~Search ITEM~~")
                println("1) Search by ID\n2) Search by Name\n3) Search by Price")
                var searchBy = readLine()!!.toInt()
                if (searchBy == 1)
                {
                    print("Enter ID :  ")
                    var idSearch = readLine()!!.toInt()
                    for (i in m)
                    {
                        if (idSearch.equals(i.ID))
                        {
                            i.vc()
                        }
                    }
                }
                else if (searchBy == 2)
                {
                    print("Enter Name :  ")
                    var nameSearch = readLine()!!.toString()
                    for (i in m)
                    {
                        if (nameSearch.equals(i.name))
                        {
                            i.vc()
                        }
                    }
                }
                else if (searchBy == 3)
                {
                    print("Enter Price :  ")
                    var priceSearch = readLine()!!.toInt()
                    for (i in m)
                    {
                        if (priceSearch.equals(i.price))
                        {
                            i.vc()
                        }
                    }
                }
                else{
                    println("Wrong Selection!!!")
                }
            }
//Update Inventory items
            3 -> {
                println("~~Update ITEM~~")
                println("1) Update by NAME\n2) Update by ID")
                var updateBy = readLine()!!.toInt()
                if (updateBy == 1)
                {
                    print("Enter Name :  ")
                    var search = readLine()!!.toString()
                    for (u in m)
                    {
                        if (search.equals(u.name)) {
                            print("Enter new Name to Update :  ")
                            var updatedName = readLine()!!.toString()
                            m.apply { u.name = updatedName }
                            println("Name Updated!\tUsing Name")
                            break
                        }
                        else{
                            println("Invalid Name")
                            break
                        }
                    }
                }
                else if (updateBy == 2)
                {
                    print("Enter ID :  ")
                    var search = readLine()!!.toInt()
                    for (u in m)
                    {
                        if (search.equals(u.ID)) {
                            print("Enter new Name to Update :  ")
                            var updatedName = readLine()!!.toString()
                            m.apply { u.name = updatedName }
                            println("Name Updated!\tUsing ID")
                            break
                        }
                        else{
                            println("Invalid Name")
                            break
                        }
                    }
                }
                else{
                    println("Wrong Selection!!")
                }
            }
//Delete Inventory Item
            4 -> {
                println("~~Delete ITEM~~")
                println("1) Delete by ID\n2) Delete by Name")
                var deleteBy = readLine()!!.toInt()
                if (deleteBy == 1)
                {
                    print("Enter ID :  ")
                    var search = readLine()!!.toInt()
                    for (d in m)
                    {
                        if (search.equals((d.ID)))
                        {
                            m.apply { m.remove(d) }
                            println("Item Removed!\tUsing ID")
                            break
                        }
                        else
                        {
                            println("ID not found!")
                            break
                        }
                    }
                }
                if (deleteBy == 2)
                {
                    print("Enter Namme :  ")
                    var search = readLine()!!.toString()
                    for (d in m)
                    {
                        if (search.equals((d.name)))
                        {
                            m.apply { m.remove(d) }
                            println("Item Removed!\tUsing NAME")
                            break
                        }
                        else
                        {
                            println("NAME not found!")
                            break
                        }
                    }
                }
                else {
                    println("Wrong Selection!!")
                }
            }
//All Inventory Details
            5 -> {
                println("~~~All Inventory Details~~~")
                for (eachInven in m)
                {
                    eachInven.vc()
                }
            }

            6 -> {
                i = -1
//                println("i = $i")
                println("Thankyou for Using Inventory System\n\tGood Luck")
            }
        }
        i++
    }while (i>0)
}