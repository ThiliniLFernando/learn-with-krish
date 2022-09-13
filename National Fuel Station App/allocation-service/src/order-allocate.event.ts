export class OrderAllocateEvent{
    constructor(
        public readonly orderId:string,
        public readonly stationId:string,
        public readonly requestQty:number,
        public readonly fuelType:string,
        public readonly requestDate:Date,
        public readonly status:string
    ){}

    toString(){
        return JSON.stringify({
            orderId: this.orderId,
            stationId: this.stationId,
            fuelType:this.fuelType,
            requestQty: this.requestQty,
            requestDate: this.requestDate,
            status:this.status
        });
    }
}