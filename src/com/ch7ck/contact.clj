(ns com.ch7ck.contact
  (:require [com.ch7ck.ui :as ui]
            [com.ch7ck.components.headers :as headers]
            [com.ch7ck.components.footers :as footers]))


(defn contact-page [ctx]
  (ui/page
   ctx
   (headers/page-header "Contact me.")
   (footers/footer)))

(def module
  {:routes [["" {}
             ["/contact-me" {:get contact-page}]]]})