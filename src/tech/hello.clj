(ns tech.hello
  (:require [org.httpkit.server :as http])
  (:gen-class))

(defn -main
  [& args]
  (let [port 8080]
    (-> (fn [request]
          {:status  200
           :headers {"Content-Type" "text/html"}
           :body    "<html><body><div><img src=\"http://techascent.com/img/techascent-960.png\"/></div><div>Hello, World! (from: TechAscent)</div></body></html>"})
        (http/run-server {:port port}))
    (println "Server Started on port:" port)))
