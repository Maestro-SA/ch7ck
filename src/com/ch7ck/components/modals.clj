(ns com.ch7ck.components.modals 
  (:require
    [com.ch7ck.components.shared :as shared]))


(defn blog-modal [& {:keys [category title body]}] 
  [:div
   {:x-show "showModal",
    :class "fixed text-gray-800 flex items-center justify-center overflow-auto z-50 bg-black bg-opacity-40 left-0 right-0 top-0 bottom-0",
    :x-transition:enter "transition ease duration-300",
    :x-transition:enter-start "opacity-0",
    :x-transition:enter-end "opacity-100",
    :x-transition:leave "transition ease duration-300",
    :x-transition:leave-start "opacity-100",
    :x-transition:leave-end "opacity-0"}
   [:div
    {:x-show "showModal",
     :x-transition:leave-end "opacity-0 scale-90 translate-y-1",
     "@click.away" "showModal = false",
     :x-transition:leave-start "opacity-100 scale-100 translate-y-0",
     :x-transition:enter "transition ease duration-100 transform",
     :class "bg-white rounded-xl shadow-2xl p-6 mx-10 max-w-md md:max-w-lg",
     :x-transition:enter-start "opacity-0 scale-90 translate-y-1",
     :x-transition:enter-end "opacity-100 scale-100 translate-y-0",
     :x-transition:leave "transition ease duration-100 transform"}
    (comment "Title")
    (shared/info-badge category)
    [:h1
     {:class "title-font sm:text-2xl text-xl font-medium text-gray-900 mb-3"}
     title]
    (comment "Some beer ?")
    (for [paragraph body]
      [:p
       {:class "leading-relaxed mb-3"}
       paragraph])
    (comment "Buttons")
    [:div
     {:class "text-center space-x-5 mt-5"}
     [:button
      {"@click" "showModal = !showModal",
       :class
       "px-4 py-2 text-sm bg-white rounded-xl border transition-colors duration-150 ease-linear border-gray-200 text-gray-500 focus:outline-none focus:ring-0 font-bold hover:bg-gray-50 focus:bg-indigo-50 focus:text-indigo"}
      "Close"]]]])