//
//  Copyright © 2017 Microsoft. All rights reserved.
//

#ifndef BaseCardElementBridge_h
#define BaseCardElementBridge_h

#include <stdio.h>

#ifdef __cplusplus
extern "C" {
#endif
    
//    const void *BaseCardElement_Initialize(int cardElementType);
//    const void *BaseCardElement_InitializeWithArgs(int cardElementType, int seperationStyle, const char* speak);
    
    int BaseCardElement_GetSeperationStyle(const void* object);
    void BaseCardElement_SetSeperationStyle(const void* object, int seperationStyle);
    
    const char* BaseCardElement_GetSpeak(const void* object);
    void BaseCardElement_SetSpeak(const void* object, const char* speak);
    
    int BaseCardElement_GetElementType(const void* object);
    
#ifdef __cplusplus
}
#endif

#endif /* BaseCardElementBridge_hpp */
