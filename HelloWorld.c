#include <stdio.h>
#include <jni.h>
#include "HelloWorld.h"

JNIEXPORT void JNICALL Java_HelloWorld_hello
  (JNIEnv *env, jclass hello) {
  printf("hello from the c\n");
}
