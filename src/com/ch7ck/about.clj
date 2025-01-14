(ns com.ch7ck.about
  (:require [com.ch7ck.ui :as ui] 
            [com.ch7ck.components.headers :as headers]
            [com.ch7ck.components.footers :as footers]
            [com.ch7ck.components.features :as features]
            [com.ch7ck.components.svgs :as svg]))


(defn about-page [ctx]
  (ui/page
   ctx
   (headers/page-header "About me.")
   (features/skills-overview)
   (features/skills)
   (footers/footer)))

(def module
  {:routes [["" {}
             ["/about-me" {:get about-page}]]]})