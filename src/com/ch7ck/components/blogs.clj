(ns com.ch7ck.components.blogs
  (:require [com.ch7ck.components.modals :as modals]
            [com.ch7ck.components.svgs :as svg]))


(defn blog [& {:keys [category title body]}]
  [:div
   {:class "p-4 lg:w-1/3"}
   [:div
    {:class "h-full bg-gray-100 bg-opacity-75 px-8 pt-16 pb-24 rounded-lg overflow-hidden text-center relative"}
    [:h2
     {:class "tracking-widest text-xs title-font font-medium text-gray-400 mb-1"}
     category]
    [:h1
     {:class "title-font sm:text-2xl text-xl font-medium text-gray-900 mb-3"}
     title]
    [:div
     {:x-data "{ showModal : false }"}
     [:a
      {"@click" "showModal = !showModal"
       :class "text-blue-500 inline-flex items-center cursor-pointer"}
      "Read"
      (svg/arrow)]
     (modals/blog-modal
      :category category
      :title title
      :body body)]]])

(defn blogs [] 
  [:section
   {:class "text-gray-600 body-font"}
   [:div
    {:class "container px-5 py-24 mx-auto"}
    [:div
     {:class "flex flex-wrap -m-4"}
     (blog :category "Programming Paradigms" 
           :title "Functional Programming vs. Concurrency in Object-Oriented Languages" 
           :body ["When working with object-oriented programming, handling concurrency can be challenging because of mutable state—data that can change over time. When multiple threads try to access and modify the same data simultaneously, it’s difficult to ensure everything remains in a valid state, which complicates testing and reliability. While object-oriented languages provide tools like transactions and locks to manage this, they are often tricky to use effectively."
                  "Functional programming, on the other hand, addresses this problem by minimizing mutable state, making code more predictable and easier to handle in concurrent environments. Scala stands out as a hybrid language that blends functional and object-oriented approaches, giving you the flexibility to write cleaner, more reliable concurrent code without entirely abandoning mutable state when it’s needed."])
     (blog :category "Programming Paradigms"
           :title "Functional Programming vs. Concurrency in Object-Oriented Languages"
           :body ["When working with object-oriented programming, handling concurrency can be challenging because of mutable state—data that can change over time. When multiple threads try to access and modify the same data simultaneously, it’s difficult to ensure everything remains in a valid state, which complicates testing and reliability. While object-oriented languages provide tools like transactions and locks to manage this, they are often tricky to use effectively."
                  "Functional programming, on the other hand, addresses this problem by minimizing mutable state, making code more predictable and easier to handle in concurrent environments. Scala stands out as a hybrid language that blends functional and object-oriented approaches, giving you the flexibility to write cleaner, more reliable concurrent code without entirely abandoning mutable state when it’s needed."])
     (blog :category "Programming Paradigms"
           :title "Functional Programming vs. Concurrency in Object-Oriented Languages"
           :body ["When working with object-oriented programming, handling concurrency can be challenging because of mutable state—data that can change over time. When multiple threads try to access and modify the same data simultaneously, it’s difficult to ensure everything remains in a valid state, which complicates testing and reliability. While object-oriented languages provide tools like transactions and locks to manage this, they are often tricky to use effectively."
                  "Functional programming, on the other hand, addresses this problem by minimizing mutable state, making code more predictable and easier to handle in concurrent environments. Scala stands out as a hybrid language that blends functional and object-oriented approaches, giving you the flexibility to write cleaner, more reliable concurrent code without entirely abandoning mutable state when it’s needed."])]]])