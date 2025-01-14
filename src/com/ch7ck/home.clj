(ns com.ch7ck.home
  (:require [com.ch7ck.middleware :as mid]
            [com.ch7ck.ui :as ui]
            [com.ch7ck.components.headers :as headers]
            [com.ch7ck.components.timelines :as timelines]
            [com.ch7ck.components.features :as features]
            [com.ch7ck.components.footers :as footers]))

(defn home-page [ctx]
  (ui/page
   ctx
   (headers/header)
   (features/features)
   (features/human-features)
   (timelines/timeline)
   (footers/footer)))



(def module
  {:routes [["" {:middleware [mid/wrap-redirect-signed-in]}
             ["/"                  {:get home-page}]]]})
