package com.easv.oe.friends.Model


class Friends {

    val mFriends = arrayOf<BEFriend>(
        BEFriend("Simon", "123", true, "wdad"),
        BEFriend("Dennis", "1234", false, "wjd"),
        BEFriend("Mina", "12345", true, "wdjawop"),
        BEFriend("Emil", "12345678", true, "wkdawkl"),
        BEFriend("Mads", "23456789", true, "dpow"),
        BEFriend("Martin", "87654321", false, "dawopd"),
        BEFriend("Mike", "12121212", true, "pdowjop"),
        BEFriend("Trine", "123", true, "dwmodw"),
        BEFriend("Mathias", "1234", false, "jwdopj"),
        BEFriend("Rasmus", "12345", true, "wdow"),
        BEFriend("Christian", "12345678", true, "grkgo"),
        BEFriend("Peter", "23456789", true, "ofjeop"),
        BEFriend("Anders", "87654321", false, "dwidni"),
        BEFriend("Mikkel", "12121212", true, "ropgj"),
        BEFriend("Flemming", "123", true, "gjeopj"),
        BEFriend("Jonas", "1234", false, "dlwmo"),
        BEFriend("Frederik", "12345", true, "pfeofk"),
        BEFriend("Mantas", "12345678", true, "opejfope"),
        BEFriend("Michael", "23456789", true, "ofjeopj"),
        BEFriend("Jens", "87654321", false, "dkwok"),
        BEFriend("Jan", "12121212", true, "okfdwop")
    )

    fun getAll(): Array<BEFriend> = mFriends


    fun getAllNames(): Array<String> = mFriends.map { p -> p.name }.toTypedArray()


}