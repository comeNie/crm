/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_esafenet_dll_NativeClientInterface */

#ifndef _Included_com_esafenet_dll_NativeClientInterface
#define _Included_com_esafenet_dll_NativeClientInterface
#ifdef __cplusplus
extern "C" {
#endif

/*
* Class:     com_esafenet_dll_NativeClientInterface
* Method:    isDynamicDecrypt
* Signature: (Ljava/lang/String;)Z
*/
JNIEXPORT jboolean JNICALL Java_com_esafenet_dll_NativeClientInterface_isDynamicDecrypt
(JNIEnv *, jclass, jstring);


/*
* Class:     com_esafenet_dll_NativeClientInterface
* Method:    DecryptFile
* Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
* 第一个参数是解密文件源路径
* 第二个参数是解密后文件存放路径
* 第三个参数是密钥
* 返回是否解密成功
*/
JNIEXPORT jboolean JNICALL Java_com_esafenet_dll_NativeClientInterface_DecryptFile
(JNIEnv *, jclass, jstring, jstring, jstring);


  /*
  * Class:     com_esafenet_dll_NativeClientInterface
  * Method:    Encrypt
  * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
  * 第一个参数是加密文件源路径
  * 第二个参数是加密后文件存放路径
  * 第三个参数是密钥
  * 返回是否加密成功
*/
JNIEXPORT jboolean JNICALL Java_com_esafenet_dll_NativeClientInterface_EncryptFile
(JNIEnv *, jclass, jstring, jstring, jstring);

#ifdef __cplusplus
}
#endif
#endif