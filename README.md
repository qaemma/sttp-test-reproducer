### How to run

```
sbt test
```

### Description

This basically runs the same test as `sttp`'s [OkHttp backend test](https://github.com/softwaremill/sttp/blob/master/okhttp-backend/src/test/scala/com/softwaremill/sttp/okhttp/OkHttpFutureHttpTest.scala).

On `sttp`, everything runs fine.

Here, every test case related to the resource files fails.

```
[info] - download a binary file using asFile *** FAILED ***
[info]   java.util.NoSuchElementException: Status code 404: The requested resource could not be found.
[info]   at com.softwaremill.sttp.Response.unsafeBody(Response.scala:54)
[info]   at com.softwaremill.sttp.testing.HttpTestExtensions.$anonfun$$init$$35(HttpTestExtensions.scala:153)
[info]   at scala.concurrent.Future.$anonfun$flatMap$1(Future.scala:303)
[info]   at scala.concurrent.impl.Promise.$anonfun$transformWith$1(Promise.scala:37)
[info]   at scala.concurrent.impl.CallbackRunnable.run(Promise.scala:60)
[info]   at org.scalatest.concurrent.SerialExecutionContext.recRunNow(SerialExecutionContext.scala:120)
[info]   at org.scalatest.concurrent.SerialExecutionContext.runNow(SerialExecutionContext.scala:111)
[info]   at org.scalatest.AsyncSuperEngine.runTestImpl(AsyncEngine.scala:295)
[info]   at org.scalatest.AsyncFreeSpecLike.runTest(AsyncFreeSpecLike.scala:419)
[info]   at org.scalatest.AsyncFreeSpecLike.runTest$(AsyncFreeSpecLike.scala:400)
```
