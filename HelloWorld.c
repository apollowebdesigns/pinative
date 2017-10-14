#include <jni.h>
#include <stdio.h>
#include "hello_HelloWorld.h"

JNIEXPORT void JNICALL Java_hello_HelloWorld_print
  (JNIEnv *, jobject)
{
     printf("Hello World!\n");
     return;
}
