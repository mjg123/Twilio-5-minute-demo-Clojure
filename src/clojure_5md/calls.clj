(ns clojure-5md.calls
  (:require [clojure-5md.secrets :refer [ACCOUNT_SID AUTH_TOKEN]])
  (:import (com.twilio Twilio
                       type.PhoneNumber
                       rest.api.v2010.account.Call
                       rest.api.v2010.account.Message)))

(Twilio/init ACCOUNT_SID AUTH_TOKEN)

(def demo-number (PhoneNumber. ""))

(->> (.. Message
         reader
         (setTo demo-number)
         read)

     (map #(.getFrom %))

     distinct

     (map #(.. Call
               (creator %
                        demo-number
                        (java.net.URI. "https://XXXXXX.ngrok.io/call"))
               create)))






