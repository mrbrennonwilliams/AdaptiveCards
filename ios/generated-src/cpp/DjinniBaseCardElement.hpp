// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from adaptivecards.djinni

#pragma once

#include <string>

namespace AdaptiveCards {

class DjinniBaseCardElement {
public:
    virtual ~DjinniBaseCardElement() {}

    virtual void SetSpeak(const std::string & speak) = 0;

    virtual std::string GetSpeak() = 0;
};

}  // namespace AdaptiveCards