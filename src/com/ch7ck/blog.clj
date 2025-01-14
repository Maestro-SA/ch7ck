(ns com.ch7ck.blog
  (:require [com.ch7ck.ui :as ui]
            [com.ch7ck.components.headers :as headers]
            [com.ch7ck.components.footers :as footers]
            [com.ch7ck.components.blogs :as blogs]))


(defn blog-page [ctx]
  (ui/page
   ctx
   (headers/page-header "Blog.")
   (blogs/blogs)
   (footers/footer)))

(def module
  {:routes [["" {}
             ["/blog" {:get blog-page}]]]})