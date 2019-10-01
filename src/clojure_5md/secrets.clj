(ns clojure-5md.secrets)

(def ACCOUNT_SID (System/getenv "ACCOUNT_SID"))
(def AUTH_TOKEN (System/getenv "AUTH_TOKEN"))

(defn redact [s]
  (if s
    (str "***" (subs s (- 20 (count s))))
    "<none>"))
