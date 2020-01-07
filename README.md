# GsonConverterFactory
http返回的code码在业务逻辑中的处理
# 需要解决的问题
后台返回的数据类型，Http Response的返回code码永远是200
然后业务返回的数据格式
```
{
  "code": 402,----->后台服务器业务相关码
  "msg": "请输入Signtoken or Timestamp",
  "data": ""------>有可能的情况1.`"data": {}`2.`"data": []`
}
```
这样的情况，当我们使用`com.squareup.retrofit2:converter-gson`的时候经常报json数据格式不对，无法序列化到你的model bean类

# 为啥这么做
当你使用Rxjava的时候不会因为序列化不到基础的Model(至少有code信息),永远走Rxjava的`Observer.onError（Throwable e）`而无法精细处理业务逻辑码
# 是否有别的方式
有，找个处理了这个问题的Gson特定第三方个人修改版本
