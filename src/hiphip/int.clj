(ns hiphip.int
  "Utilities for int arrays"
  (:refer-clojure :exclude [amap areduce alength aget aset aclone])
  (:import hiphip.int_.JavaBaseline))

(def type-info
  {:etype `int
   :atype "[I"
   :constructor `int-array
   :min-value `Integer/MIN_VALUE
   :max-value `Integer/MAX_VALUE})

(load "type_impl")
