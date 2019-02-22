(ns tech.hello
  (:require [org.httpkit.server :as http])
  (:gen-class))

(defn -main
  [& args]
  (let [port 8080]
    (-> (fn [request]
          {:status  200
           :headers {"Content-Type" "text/html"}
           :body    "<html><body>Hello, World! (from: TechAscent)</body></html>"})
        (http/run-server {:port port}))
    (println "Server Started on port:" port)))
