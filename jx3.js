use mydb
// 添加数据
game={"name":"jx3",
"content":[{"name":"叶雪风","职业":"藏剑"},{"name":"小小琉璃","职业":"万花"}],
}
db.jx3.insert(game)
// 按ObjectId搜索文档,修改content内容,并修改
var jx3=db.jx3.find({"_id": ObjectId("5bd97080e13dd94858c415c7")})
jx3.content=[{"name":"叶雪风","职业":"藏剑"},{"name":"小小琉璃","职业":"万花"},{"name":"悲莫悲生别离","职业":"蓬莱"}]
db.jx3.update({"_id": ObjectId("5bd91415fac210459cee4ef6")},jx3)
// 用push方式修改指定ObjectId的文档(新插入一个数据到content中)
db.jx3.update({"_id": ObjectId("5bd91415fac210459cee4ef6")},
{"$push":{"content":
  {"name":"笛音不渡","职业":"五毒"}}})
  // 插入多个内容到content中(each),最多插入10个文档(slice)
db.jx3.update
({"_id": ObjectId("5bd928b706c731a4a068ebd5")},
{"$push":{"content":
  {"$slice":-10,
    "$each":[{"name":"陆迟墨","职业":"明教"},{"name":"长孙岚雪","职业":"五毒"}]}}})
    //根据ObjectId删除文档 
db.jx3.remove({"_id" : ObjectId("5bd97196e13dd94858c415c9")})
// 根据ObjectId删除某一个集合里的某条数据
db.jx3.update({"_id" : ObjectId("5bd92050273e152f114d001a")},{"$pull":{"content":{"name":"叶雪风","职业":"藏剑"}}})
// 根据ObjectId查找文档
db.jx3.find({"_id": ObjectId("5bd928b706c731a4a068ebd5")})
// jx3的状态,可以查看填充因子
db.jx3.stats()
// 用save方式修改content
var j=db.jx3.findOne()
j.content=[{"name":"叶雪风","职业":"藏剑"},{ "name" : "笛音不渡", "职业" : "五毒" },{"name":"小小琉璃","职业":"万花"},{"name":"悲莫悲生别离","职业":"蓬莱"},{"name":"长孙岚雪","职业":"五毒"}]
db.jx3.save(j)
// 不重复的添加内容到content
db.jx3.update({"_id": ObjectId("5bd928b706c731a4a068ebd5")},{"$addToSet":{"content":{"name":"陆迟墨","职业":"明教"}}})
// 适用于大量移动或经常打乱数据,用这样的方式提高复用率 但是实际操作之后collectionName说没有定义
db.runCommand({"collMod":collectionName,"usePowerOf2Sizes":true})
